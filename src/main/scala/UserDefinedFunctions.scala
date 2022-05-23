package UserDefinedFunctions

object Math {
    /* You can create a Snowflake UDF (User Defined Function) from the 'simpleDivision' function. You only need to follow these steps:
        1. Import the build (this can be done from the Metals extension tab on the left activity bar). Wait for this import to finish.
        2. Right-click on the build.sbt file in the root of this project.
        3. Choose the 'Black Diamond: Export Scala UDF' option.
        4. Fill the template file 'UDF-Export-Snowflake-Scala.sql' (on the 'Target' folder) with the requested information
            (you can ignore or delete the section 3.1, since that part is used to export a Procedure and section 3.2
            is used to export a User Defined Function, which is what we are doing in this case).
        5. Execute the SQL commands in the template file.
    */
    def simpleDivision(a: Double, b: Double): Double = {
        a / b
    }
}