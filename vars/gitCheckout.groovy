def call(Map stageParams) {
 
    checkout([
        $class: 'GitSCM',
        branches: [[name:  stageParams.branch ]],
        userRemoteConfigs: [[ url: stageParams.url ]]
        userRemoteConfigs: [[ credentialsId: stageParams.credentialsId ]]
    ])
  }