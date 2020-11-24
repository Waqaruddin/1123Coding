

fun getContact(contactNames: Array<String>, contactNumbers: Array<String>, searchStr: String): String? {
    var contactName = ""
    var low = Int.MAX_VALUE
    for (i in contactNumbers.indices) {
        val number = contactNumbers[i]
        if (searchStr.length < number.length) if (number.contains(searchStr) && isNumeric(searchStr)) {
            if (contactNames[i].compareTo(contactName, ignoreCase = true) < low) {
                low = contactName.compareTo(contactNames[i], ignoreCase = true)
                contactName = contactNames[i]
            }
        }
    }
    if (contactName.isEmpty()) contactName = "NO CONTACT"
    return contactName
}


private fun isNumeric(str: String): Boolean {
    return try {
        str.toDouble()
        true
    } catch (e: NumberFormatException) {
        false
    }
}