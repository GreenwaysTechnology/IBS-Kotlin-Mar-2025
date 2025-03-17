package com.ibs.kotlin.basics.types

fun main() {
    //traditional style: java style
    var doc = "<html>" +
            "<head>" +
            "<title>Home</title>" +
            "</head>" +
            "<body>" +
            "</body>" +
            "</html>"
    println(doc)
    var message = "How are you"
    var newDoc ="""
         <html>
         <head>
         <title>Home</title>
         </head>
         <body>
         <h1>${message}</h1>
         </body>
        </body>
        
    """.trimIndent()
    println(newDoc)
}