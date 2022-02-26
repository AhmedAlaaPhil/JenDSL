job('DSL-DXL-GitHub-file') {

    description 'A very simple demo for the Jenkins Job DSL'
    scm {
        git('https://github.com/AhmedAlaaPhil/JenTest.git')
    }
    triggers {
        scm('H/15 * * * *')
    }
    steps {
        maven('-e clean test')
    }
    publishers {
        archiveTestNG('**/testng-results.xml')
    }
}
