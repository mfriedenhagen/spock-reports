package com.athaydes.spockframework.report

import com.athaydes.spockframework.report.internal.SpecData

/**
 *
 * User: Renato
 */
interface IReportCreator {

    void createReportFor( SpecData data )

    void setOutputDir( String path )

    void setHideEmptyBlocks( boolean hide )

    void setShowCodeBlocks(boolean show )

    void setTestSourceRoots( String roots )

    void setProjectName( String projectName )

    void setProjectVersion( String projectVersion )

    void done()

}