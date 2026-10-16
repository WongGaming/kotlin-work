// COMP2850 Portfolio: Week 2
// Function to redact sensitive information in a string
fun redact(original: String, replaceString: String, redactChar: Char = 'X'): String
{   
    if(replaceString.isEmpty())
    {
        return original
    }
    var replacementString = ""
    for (i in 0..(replaceString.length-1))
    {
        replacementString += redactChar
    }
    return original.replace(replaceString, replacementString)
}