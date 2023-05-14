def call(Map stageParams) {
 
    checkout([
        $class: 'GitSCM',
        branches: [[name:  stageParams.branch ]],
        userRemoteConfigs: [[ url: stageParams.url ]]
        // userRemoteConfigs: [[ credentialsId: stageParams.credentialsId ]]
        withCredentials ([usernamePassword(credentialsId: 'PAT_Git_Jenkins')])
                        // Your code using the GitHub credentials
                        // sh 'git clone https://${GIT_USERNAME}:${GIT_PASSWORD}@github.com/your/repository.git'
                        // Additional steps using the credentials
                        // withCredentials([usernamePassword(credentialsId: 'PAT_Git_Jenkins', usernameVariable: 'GIT_USERNAME', passwordVariable: 'GIT_PASSWORD')])

    ])
  }