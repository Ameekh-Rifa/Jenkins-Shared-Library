def call(Map stageParams) {
 
    /* withCredentials([
        usernamePassword(
            credentialsId: stageParams.credentialsId,
            usernameVariable: 'GIT_USERNAME',
            passwordVariable: 'GIT_PASSWORD'
        )
    ]) */
    checkout([
        $class: 'GitSCM',
        branches: [[name:  stageParams.branch ]],
        userRemoteConfigs: [[ url: stageParams.url, credentialsId: stageParams.credentialsId ]]
    ])
  }