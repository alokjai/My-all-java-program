<?xml version="1.0" encoding="UTF-8" standalone="no"?>
<!-- WARNING: Eclipse auto-generated file.
              Any modifications will be overwritten.
              To include a user specific buildfile here, simply create one in the same
              directory with the processing instruction <?eclipse.ant.import?>
              as the first entry and export the buildfile again. --><project basedir="." default="build" name="hello">
    <property environment="env"/>
    <property name="ECLIPSE_HOME" value="../../eclipse/"/>
    <property name="debuglevel" value="source,lines,vars"/>
    <property name="target" value="1.8"/>
    <property name="source" value="1.8"/>
    <path id="hello.classpath">
        <pathelement location="."/>
    </path>
    <target name="init">
        <copy includeemptydirs="false" todir=".">
            <fileset dir=".">
                <exclude name="**/*.java"/>
            </fileset>
        </copy>
    </target>
    <target name="clean">
        <delete>
            <fileset dir="." includes="**/*.class"/>
        </delete>
    </target>
    <target depends="clean" name="cleanall"/>
    <target depends="build-subprojects,build-project" name="build"/>
    <target name="build-subprojects"/>
    <target depends="init" name="build-project">
        <echo message="${ant.project.name}: ${ant.file}"/>
        <javac debug="true" debuglevel="${debuglevel}" destdir="." includeantruntime="false" source="${source}" target="${target}">
            <src path="."/>
            <classpath refid="hello.classpath"/>
        </javac>
    </target>
    <target description="Build all projects which reference this project. Useful to propagate changes." name="build-refprojects"/>
    <target description="copy Eclipse compiler jars to ant lib directory" name="init-eclipse-compiler">
        <copy todir="${ant.library.dir}">
            <fileset dir="${ECLIPSE_HOME}/plugins" includes="org.eclipse.jdt.core_*.jar"/>
        </copy>
        <unzip dest="${ant.library.dir}">
            <patternset includes="jdtCompilerAdapter.jar"/>
            <fileset dir="${ECLIPSE_HOME}/plugins" includes="org.eclipse.jdt.core_*.jar"/>
        </unzip>
    </target>
    <target description="compile project with Eclipse compiler" name="build-eclipse-compiler">
        <property name="build.compiler" value="org.eclipse.jdt.core.JDTCompilerAdapter"/>
        <antcall target="build"/>
    </target>
</project>
