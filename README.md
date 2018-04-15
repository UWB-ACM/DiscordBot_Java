# DiscordBot_Java

> A barebones Java-based Discord bot example written using [Discord4J](https://github.com/Discord4J/Discord4J).

For a barbones python-based example, See also [CSSBot_Py](https://github.com/UWB-ACM/CSSBot_Py).

For a full example written in C#, See also [CSSBot](https://github.com/Chris-Johnston/CSSBot).

# Table of Contents

-   [Installation](#installation)
    -   [Prerequisites](#prerequisites)
    -   [Setup](#setup)
    -   [Setting Up Your Bot](#setting-up-your-bot)
        -   [Register Your Discord Bot](#register-your-discord-bot)   
-   [Usage](#usage)
-   [Contributing](#contributing)

# Installation

This repository utilizes [Gradle](https://gradle.org/) in order to automate the process of building the environment.

## Prerequisites

-   [Gradle](https://gradle.org/install/)(4.5.1)
-   [Java JDK](http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html)(8)
-   **Optional** [IntelliJ idea](https://www.jetbrains.com/idea/)

## Setup

**Note** For a detailed description of how to set up your environment with Gradle (for beginners), please see [Setting Up Your Environment](https://github.com/UWB-ACM/DiscordBot_Java/wiki/Setting-Up-Your-Environment).

After cloning and forking the repository, run the following command within the local directory:

    gradle build

To build the IntelliJ idea files, run the following command:

    gradle idea

**Note** For more tasks, see also [Usage](#usage)

## Setting Up Your Bot

We have designed this barebones example to be quite easy to set up. All you need to do is find out your bot's user token. In order to do that, we must register our bot on discord.

### Register Your Discord Bot

-   Navigate to the Discord API docs and [login](https://discordapp.com/developers/applications/me).
-   Click on the "New App" button.
-   Name your app. Click "Create App".
-   Click "Create a Bot User".
-   Locate your bot's user token.
    -   **Your user token must not be shared with anyone. If it is posted publicly, change it ASAP.**
-   Create a new file in your directory: `config.properties`
-   Add your token to the first line in the file. Example (inside `config.properties`):

            token=[TOKEN GOES HERE]

# Usage

All of these commands must be run in the command line (or terminal) in the same directory as the local repository.

To build runnable executables of the bot:

    gradle build

To execute the bot:

    gradle run

**Note** If running in Windows, you can stop the Bot from running by performing `CTRL + C` and then confirming the decision by pressing `Y`

To clean the repository of the current build:

    gradle clean

To create the necessary IntelliJ files:

    gradle idea

To clean the IntelliJ files:

    gradle cleanIdea

To see all available tasks:

    gradle tasks

# Contributing

Please see CONTRIBUTING.md for more information **TODO**
