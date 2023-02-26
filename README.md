# Hugo Project with Tailwind CSS Template and Gradle Build
This is a full Hugo Site already set up for ready to go. The Theme is based on [Tailwind CSS](https://tailwindcss.com/) and can be built with Gradle, which also can be used to run a development Server. 

## Getting started

This project is intended for Full Stack Developers who are familiar with projects built using Java and Node. 

### Prerequisites
To get started, make sure you have the following prerequisites installed:

1. JDK - necessary for Gradle scripts to function properly.
2. Node - necessary for using Tailwind CSS Just-In-Time mode.

You don't need to explicitly install Hugo since it's handled by Gradle.

### Clone repository
Clone this repository to your development machine:
    git clone https://github.com/trx-base/hugo-tailwind-gradle.git

### Run development server
Either run from command line or from within your IDE:
    ./gradlew hugoServer

### Open site in browser
Navigate to (http://localhost:1313)

## Tailwind Just-In-Time
Tailwind CSS Just-In-Time (JIT) is a feature that dynamically generates CSS styles as they are needed, rather than pre-generating them all up front. This results in a smaller CSS file size and faster load times, as only the styles that are actually used on a page are generated and included in the final CSS output.

To trigger the generation of CSS styles, follwoing node script must be executed from within the tailwind theme folder:
    
    cd ./site/themes/tailwind
    npm run build-tw

### VS Code Auto Save
This project has included a configuration for the [Run on Save](https://marketplace.visualstudio.com/items?itemName=emeraldwalk.RunOnSave) plugin for VS Code. It automatically triggeres the `build-tw` action after each save. There might be a slight delay for the page update in case new Tailwind CSS classes are introduced.  




