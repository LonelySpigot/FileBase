# FileBase

Thank you for considering my plugin! You are free to use this plugin for any
purposes. It is a fairly small and simple plugin I use to access files in my file-based
plugins.

## Installation

To install my plugin on a spigot server just download the latest build 
[here](http://www.mediafire.com/file/ya0s9t2a09hk5w9/FileBase-1.1.6.jar/file) 
and add it to your `plugins` folder on your Spigot server. It is a dependency
for almost all of my other plugins.

To use this Plugin in your own ones just add this plugin as dependency to your own
one in the `plugin.yml`:
```yaml
depend:
  - FileBase
```
Make sure to add the jar as external library too.

## Usage

The base Folder for this plugin is the `plugins` folder. You may change it in the
plugin config **as a relative path to the `plugins` folder**.

In general it is a good idea to save `FileBase.FILE_LOADER` as static variable in
your own plugin to easily access it from all sources:
```java
static fileLoader = FileBase.FILE_LOADER;
```

### Getting FileConfigurations

To acquire any `FileConfiguration` use:
```java
fileLoader.getConfiguration("path/from/plugins/name.yml");
```

### Saving Configurations

After you edited the configurations you simply save them with:
```java
fileLoader.setConfiguration("path/from/plugins/name.yml");
```

***

Thank you for using my plugins. I hope you find this one useful besides it being so small.
