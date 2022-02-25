job('DSL-DXL') {
    scm {
        git('https://github.com/AhmedAlaaPhil/JenTest.git')
    }
    triggers {
        scm('H/01 * * * *')
    }
    steps {
        maven('-e clean test')
    }
}
