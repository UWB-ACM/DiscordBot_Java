# DiscordBot_Java

A barebones Java-based Discord bot example written using [Discord4J](https://github.com/Discord4J/Discord4J).

For a python-based example, See also [CSSBot_Py](https://github.com/UWB-ACM/CSSBot_Py).

# Table of Contents

-   [Installation](#installation)
    -   [Prerequisites](#prerequisites)
    -   [Setting Up Your Environment](#setting-up-your-environment)
        -   [Setting up Gradle](#setting-up-gradle)
        -   [Getting a local copy of the repository](#getting-a-local-copy-of-the-repository)
    -   [Building the environment](#building-the-environment)
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

## Setting Up Your Environment

### Setting up Gradle

Gradle is a quite simple tool to use, after it is set up properly. In order to check to see if it is properly set up, type into the command line:

    gradle

The result should be along the lines of:

    > Task :help

    Welcome to Gradle 4.5.1.

    To run a build, run gradle <task> ...

    To see a list of available tasks, run gradle tasks

    To see a list of command-line options, run gradle --help

    To see more detail about a task, run gradle help --task <task>

**Note** if an error occurs, make sure to add Gradle's file path to the `PATH` variable in your system's environment. If that still doesn't fix the problem, then verify that you installed Gradle correctly.

Once Gradle is set up, it's time to get a local copy of the repository to your system.

### Getting a local copy of the repository

[Fork](https://help.github.com/articles/fork-a-repo/) this repository.

Open the command line (or terminal in Linux) and find a safe place to put your local copy of the repository.

Clone the forked repository:

    git clone https://github.com/[YOUR_USERNAME_HERE]/DiscordBot_Java

### Building the environment

Open the command line (or terminal in Linux) and navigate to the repository's directory.

Type in the following command:

    gradle build

**Optional** If you are using IntelliJ, run the following command:

    gradle idea

**Note** You might need to import the project as a Gradle project when you open IntelliJ.

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

TODO: Elaborate more on this section

Run the following command:

    gradle run

# Contributing

Please see CONTRIBUTING.md for more information (TODO)
