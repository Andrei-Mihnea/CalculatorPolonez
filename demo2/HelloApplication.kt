package org.example.demo2

import javafx.application.Application
import javafx.fxml.FXMLLoader
import javafx.scene.Scene
import javafx.stage.Stage

class Content
{
    private var author: String? = null
    private var text: String? = null
    private var name: String? = null
    private var publisher: String? = null

    public fun getAuthor():String?
    {
        return author
    }

    public fun SetAuthor(_author:String)
    {
        this.author = _author
    }

    public fun getText():String?
    {
        return this.text
    }

    public fun setText(_text:String) {
        this.text = _text
    }

    public fun getName():String?
    {
        return name
    }

    public fun setName(_name:String)
    {
        this.name = _name
    }

    public fun getPublisher():String?
    {
        return publisher
    }

    public fun setPublisher(_publisher:String)
    {
        this.publisher = _publisher
    }

}

class Book(val content: Content)
{
    private var data: Content? = null

    override fun toString():String
    {
        return "Content (author =${content.getAuthor()}\ntext = ${content.getText()}\nname = ${content.getName()}\npublisher =${content.getPublisher()}"
    }

    public fun getAuthor():String?
    {
        return content.getAuthor();
    }

    public fun getName():String?
    {
        return content.getName();
    }

    public fun getPublisher():String?
    {
        return content.getPublisher()
    }

    public fun getContent():String
    {
        return toString()
    }

    public fun hasAuthor(_author:String):Boolean
    {
        if(_author != null)
        {
            return true
        }

        return false
    }

    public fun hasTitle(_title:String):Boolean
    {
        if(_title != null)
        {
            return true
        }

        return false
    }

    public fun isPublishedBy(_publisher:String):Boolean
    {
        if(_publisher != null)
        {
            return true
        }

        return false
    }
}

class Library(book:Book)
{
    private var books:Book? = null
}




fun main() {

}