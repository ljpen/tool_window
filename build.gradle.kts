// Copyright 2000-2022 JetBrains s.r.o. and contributors. Use of this source code is governed by the Apache 2.0 license.

plugins {
  id("java")
  id("org.jetbrains.intellij") version "1.8.0"
}

group = "org.intellij.sdk"
version = "2.0.0"

dependencies {
  implementation("org.springframework:spring-context:5.2.4.RELEASE")
}
repositories {
  mavenCentral()
}

java {
  sourceCompatibility = JavaVersion.VERSION_11
}

// See https://github.com/JetBrains/gradle-intellij-plugin/
intellij {
  version.set("2021.3.3")
}


tasks {
  buildSearchableOptions {
    enabled = false
  }

  patchPluginXml {
    version.set("${project.version}")
    sinceBuild.set("213")
    untilBuild.set("222.*")
  }
}
