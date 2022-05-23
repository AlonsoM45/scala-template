package Procedures
import com.snowflake.snowpark._
import com.snowflake.snowpark.functions._
import com.snowflake.snowpark.types.StructType
import com.snowflake.snowpark.types.StructField
import com.snowflake.snowpark.types.IntegerType
import com.snowflake.snowpark.types.StringType
object Example {
    def showDummyTable(sess: Session): String = {
        val idColumn: StructField = StructField("id", IntegerType)
        val valueColumn: StructField = StructField("value", StringType)
        val structure = StructType(Array(idColumn, valueColumn))
        sess.createDataFrame(Seq(Row(1, "one"), Row(2, "two")), structure).write.saveAsTable("exampleDummyTable")
        "Procedure Executed Successfully"
    }
}