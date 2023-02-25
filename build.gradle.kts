
plugins {
    id("io.github.fstaudt.hugo") version "0.5.1"
}

tasks.hugoServer {
    doFirst {
        exec {
            workingDir("site/themes/tailwind")
            commandLine("npm", "install")
        }
    }
}

