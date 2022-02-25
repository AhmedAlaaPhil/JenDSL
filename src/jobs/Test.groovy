job('DSL-DXL') {
    scm {
        git('https://github.com/AhmedAlaaPhil/JenTest.git')
    }
    triggers {
        scm('H/15 * * * *')
    }
    steps {
        maven('-e clean test')
    }
}
