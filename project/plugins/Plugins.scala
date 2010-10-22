import sbt._

class Plugins(info: ProjectInfo) extends PluginDefinition(info)
{
    // Managed dependencies that are used by the project file itself.
    // Putting them here allows them to be imported in the project class.

    val t_repo = "t_repo" at "http://tristanhunt.com:8081/content/groups/public"
    val posterous = "net.databinder" % "posterous-sbt" % "0.1.5"

    // My Maven repo.

    val clapperMavenRepo = "clapper.org Maven Repo" at
        "http://maven.clapper.org/"

    val grizzled = "org.clapper" % "grizzled-scala" % "0.2"
    val markdown = "org.clapper" % "sbt-markdown-plugin" % "0.2.1"
    val editsource = "org.clapper" % "sbt-editsource-plugin" % "0.2.1"
    val izpackPlugin = "org.clapper" % "sbt-izpack-plugin" % "0.2.1"
}