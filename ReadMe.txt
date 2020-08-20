       GitHook  Info:
 
 Step1 : create pre-commit under root directory
 
 Step2:  Applevel build.gradle
            android {
            compileSdkVersion 30
            buildToolsVersion "30.0.0"
                copy {
                from "../pre-commit"
                into "../.git/hooks"
                fileMode 0777
            }  
            
 Step 3: Create detekt.gradle, klint.gradle or any lint gradle
 Step 4: Apply them in Applevel build.gradle as below:
 apply from: '../ktlint.gradle'
 apply from: '../detekt.gradle'
 
      
      
         SonarQube Info links:
        http://androidhubb.blogspot.com/2019/04/sonarqube-android-how-to-use-sonarqube.html
        gradlew sonarqube  -Dsonar.host.url=http://localhost:9000/
        https://rules.sonarsource.com/kotlin
        http://localhost:9000/profiles
        Detekt......
        https://medium.com/@heri.sulis/integrating-kotlin-detekt-cli-on-android-gradle-task-a02ca0378dcc
        https://medium.com/@abdullahbalta/improving-kotlin-quality-fc59df802ba8
        gradlew check
        gradlew lint
