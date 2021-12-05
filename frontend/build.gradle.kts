import java.io.FileOutputStream

plugins {
    base
}

task<Exec>("start") {
    commandLine("npm", "start")
}

task<Exec>("npm_build") {
    commandLine("npm", "run", "build")
}

task<Exec>("npm_install") {
    commandLine("npm", "install")
    standardOutput = FileOutputStream("./install.txt")
}

task<Exec>("test") {
    commandLine("npm", "test", "--", "--watchAll=false")
    standardOutput = FileOutputStream("./out.txt")
}

tasks.named<Delete>("clean") {
    delete = setOf ("dist")
}

tasks.named("check") {
    dependsOn("test")
}

tasks.named("assemble") {
    dependsOn("npm_install")
    dependsOn("npm_build")
}
