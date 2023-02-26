
plugins {
    id("io.github.fstaudt.hugo") version "0.5.1"
}

tasks.hugoBuild {
    doFirst {
        exec {
            workingDir("site/themes/tailwind")
            commandLine("npm", "install")
        }
    }
}

tasks.hugoServer {
    doFirst {
        exec {
            workingDir("site/themes/tailwind")
            commandLine("npm", "install")
        }
    }
}




