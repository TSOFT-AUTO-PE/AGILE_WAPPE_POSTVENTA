pipeline {
     parameters {
      string(name: 'NODE_NAME', defaultValue: '', description: 'Enter the name of the node for the execution')
      string(name: 'DATA_FILE', defaultValue: 'C:\\DATA_Jenkins\\TDP_WAPPE', description: 'Enter the Path of the DATA ENTRY, this must be in the NODE')
      string(name: 'TAG_NAME', defaultValue: '@', description: 'Enter TAG for Execution')
      string(name: 'SONAR_EXE', defaultValue: 'YES', description: 'Enter YES or NO to Execute SONARQ')
      //string(name: 'TEST_TAG', defaultValue: 'mvn test -Dcucumber.options="--tags ', description: 'This parameter is STATIC, do not Change')
      //string(name: 'COPY_DESC', defaultValue: '.\\src\\main\\resources\\excel', description: 'Change backslash')
     }

      agent {
             node { label "${params.NODE_NAME}"}
         }

   stages {
        stage('Run Static Analysis with SonarQ') {
                steps {
                        script{
                                if("${params.SONAR_EXE}" == 'YES'){
                                        withSonarQubeEnv('sonarserver') {
                                                bat "mvn sonar:sonar"
                                        }
                                                                 //         timeout(time: 1, unit: 'HOURS'){
                                                                   //       def qg = waitForQualityGate()
                                                                       //       if(qg.status != 'OK'){
                                                                          //    error "Pipeline aborted due to Quality gate failure: ${qg.status}"
                                                                         //     }
                                                                       //   }
                                }else{echo "No se ejecuta el SONARQ"}

                        }

                }
        }

        stage('Clean the Script') {
                steps {
                        dir('target') {
                                deleteDir()
                        }
                        dir('img') {
                                deleteDir()
                        }
                        bat 'mvn clean'
                }
        }

        stage('Update DATA') {
                steps {
                        script {
                                def body = '.\\src\\main\\resources\\excel\\TDP_WAPPE'
                                bat "xcopy /s ${params.DATA_FILE} ${body} /y"
                        }
                }
        }

        stage('Run Test') {
                steps {
                        script {
                                def mvnVariable = 'mvn test -Dcucumber.options="--tags '
                                bat "${mvnVariable}${params.TAG_NAME}"

                        }
                }
        }

        stage('Archive Results WORD') {
            steps {
            archiveArtifacts 'target/resultado/*.docx'
            }
      }

       stage('Archive Results IMG') {
             steps {
      		 archiveArtifacts 'target/resultado/img/**/*.*'
                  }
            }
      stage('Archive Results HTML') {
            steps {
		    archiveArtifacts 'target/resultado/frontend-reporte.html'
            }
      }
      stage('Archive Results EXCEL') {
                  steps {
      		    archiveArtifacts 'src/main/resources/excel/**/*.*'
                  }
            }
      stage('Cleaning WS') {
            steps {
            dir('target') {
                deleteDir()
                }
                                 dir('img') {
                                                deleteDir()
                                                }

            }
      }
    }
}
