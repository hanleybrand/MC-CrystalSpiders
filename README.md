#Crystal Spiders

A Minecraft Mod about spiders. And they're made of crystal, or something?

Maybe some other stuff. We'll see. 


_Currently built for Minecraft 1.8.9 / Forge Build 1.8.9-11.15.0.1722_


##Hacking on this repo

Clone this repo - `git clone git@github.com:hanleybrand/MC-CrystalSpiders.git`

Set up as per the instructions below, and send a PR when you've done something cool. 
Don't worry, I'm not actually expecting anyone to contribute back to this. 
I'll be surprised if anyone even ever tries it out. Or even looks at this repo.

###Standalone source installation


**Step 1:** Open your command-line and browse to the folder where you extracted the zip file.

**Step 2:** Once you have a command window up in the folder that the downloaded material was placed, type:

`gradlew setupDecompWorkspace` (Windows)

`./gradlew setupDecompWorkspace` (Posix)

**Step 3:** After all that finished, you're left with a choice.
For eclipse, run "gradlew eclipse" (./gradlew eclipse if you are on Mac/Linux)

If you prefer to use IntelliJ IDEA 15, the steps are a little different:

1. Open IDEA 15, and choose _New > Project from Existing Sources..._
2. Select the MC-CrystalSpiders/build.gradle file and leave the defaults unless you know better.
3. Once it's finished you must close IntelliJ and run the following command:


`gradlew genIntellijRuns`  (Windows)

`./gradlew genIntellijRuns` (Posix)


**Step 4:** The final step is to open Eclipse and switch your workspace to /eclipse/ 
(if you use IDEA, it should automatically start on your project)

If at any point you are missing libraries in your IDE, or you've run into problems you can run 

> `./gradlew --refresh-dependencies` to refresh the local cache. 
> `./gradlew clean` to reset everything {this does not effect your code} 

and then start the processs again.

Should it still not work, 
Refer to #ForgeGradle on EsperNet for more information about the gradle environment.


####Tip:

If you do not care about seeing Minecraft's source code you can replace "setupDecompWorkspace" with one of the following:
"setupDevWorkspace": Will patch, deobfusicated, and gather required assets to run minecraft, but will not generated human readable source code.
"setupCIWorkspace": Same as Dev but will not download any assets. This is useful in build servers as it is the fastest because it does the least work.

####Tip:

When using Decomp workspace, the Minecraft source code is NOT added to your workspace in a editable way. 
Minecraft is treated like a normal Library. 
Sources are there for documentation and research purposes and usually can be accessed under the 'referenced libraries' section of your IDE.

### Forge source installation

MinecraftForge ships with this code and installs it as part of the forge
installation process, no further action is required on your part.

### LexManos' Install Video

https://www.youtube.com/watch?v=8VEdtQLuLO0&feature=youtu.be

For more details update more often refer to the Forge Forums:
http://www.minecraftforge.net/forum/index.php/topic,14048.0.html
