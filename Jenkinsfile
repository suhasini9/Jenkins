pipeline{
agent any
stages{
stage("Cleaning Stage"){
bat "mvn clean"
}
stage("Testing Stage"){
bat "mvn test"
}
stage("Packaging stage"){
bat "mvn package"
}
}
}