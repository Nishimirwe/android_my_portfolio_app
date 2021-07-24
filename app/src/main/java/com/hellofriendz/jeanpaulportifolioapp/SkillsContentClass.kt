package com.hellofriendz.jeanpaulportifolioapp

class SkillsContentsClass(
    private var image: Int,
    private var percentage: Int,
    private var name: String,
    private var description: String
)
{
    fun getImage()=image
    fun getName()=name
    fun getPercentage()=percentage
    fun getDescription()=description
}