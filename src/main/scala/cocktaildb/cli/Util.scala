package io.github.thexxiv
package cocktaildb.cli

import cocktaildb.CocktailDB

object Util {
  def search(str: String): Unit = {
    val data = CocktailDB.search(str)
    if (data != null && !data.isEmpty) {
      data.forEach(obj => {
        if (obj.strDrink != null) printf("Drink: %s\n", obj.strDrink)
        if (obj.idDrink != null) printf("Id: %s\n", obj.idDrink)
        if (obj.strDrinkAlternate != null) printf("Drink Alternate: %s\n", obj.strDrinkAlternate)
        if (obj.strTags != null) printf("Tags: %s\n", obj.strTags)
        if (obj.strCategory != null) printf("Category: %s\n", obj.strCategory)
        if (obj.strIBA != null) printf("IBA: %s\n", obj.strIBA)
        if (obj.strAlcoholic != null) printf("Alcoholic: %s\n", obj.strAlcoholic)
        if (obj.strGlass != null) printf("Glass: %s\n", obj.strGlass)
        if (obj.strInstructions != null) printf("Instructions: %s\n", obj.strInstructions)
        if (obj.strInstructionsDE != null) printf("InstructionsDE: %s\n", obj.strInstructionsDE)
        if (obj.strInstructionsES != null) printf("InstructionsES: %s\n", obj.strInstructionsES)
        if (obj.strInstructionsFR != null) printf("InstructionsFR: %s\n", obj.strInstructionsFR)
        if (obj.strInstructionsIT != null) printf("InstructionsIT: %s\n", obj.strInstructionsIT)
        if (obj.strInstructionsZHHANS != null) printf("InstructionsZH-HANS: %s\n", obj.strInstructionsZHHANS)
        if (obj.strInstructionsZHHANT != null) printf("InstructionsZH-HANT: %s\n", obj.strInstructionsZHHANT)
        if (obj.strDrinkThumb != null) printf("Image: %s\n", obj.strDrinkThumb)
        if (obj.strVideo != null) printf("Video: %s\n", obj.strVideo)
        if (obj.strIngredient1 != null) printf("Ingredient1: %s\n", obj.strIngredient1)
        if (obj.strIngredient2 != null) printf("Ingredient2: %s\n", obj.strIngredient2)
        if (obj.strIngredient3 != null) printf("Ingredient3: %s\n", obj.strIngredient3)
        if (obj.strIngredient4 != null) printf("Ingredient4: %s\n", obj.strIngredient4)
        if (obj.strIngredient5 != null) printf("Ingredient5: %s\n", obj.strIngredient5)
        if (obj.strIngredient6 != null) printf("Ingredient6: %s\n", obj.strIngredient6)
        if (obj.strIngredient7 != null) printf("Ingredient7: %s\n", obj.strIngredient7)
        if (obj.strIngredient8 != null) printf("Ingredient8: %s\n", obj.strIngredient8)
        if (obj.strIngredient9 != null) printf("Ingredient9: %s\n", obj.strIngredient9)
        if (obj.strIngredient10 != null) printf("Ingredient10: %s\n", obj.strIngredient10)
        if (obj.strIngredient11 != null) printf("Ingredient11: %s\n", obj.strIngredient11)
        if (obj.strIngredient12 != null) printf("Ingredient12: %s\n", obj.strIngredient12)
        if (obj.strIngredient13 != null) printf("Ingredient13: %s\n", obj.strIngredient13)
        if (obj.strIngredient14 != null) printf("Ingredient14: %s\n", obj.strIngredient14)
        if (obj.strIngredient15 != null) printf("Ingredient15: %s\n", obj.strIngredient15)
        if (obj.strMeasure1 != null) printf("Measure1: %s\n", obj.strMeasure1)
        if (obj.strMeasure2 != null) printf("Measure2: %s\n", obj.strMeasure2)
        if (obj.strMeasure3 != null) printf("Measure3: %s\n", obj.strMeasure3)
        if (obj.strMeasure4 != null) printf("Measure4: %s\n", obj.strMeasure4)
        if (obj.strMeasure5 != null) printf("Measure5: %s\n", obj.strMeasure5)
        if (obj.strMeasure6 != null) printf("Measure6: %s\n", obj.strMeasure6)
        if (obj.strMeasure7 != null) printf("Measure7: %s\n", obj.strMeasure7)
        if (obj.strMeasure8 != null) printf("Measure8: %s\n", obj.strMeasure8)
        if (obj.strMeasure9 != null) printf("Measure9: %s\n", obj.strMeasure9)
        if (obj.strMeasure10 != null) printf("Measure10: %s\n", obj.strMeasure10)
        if (obj.strMeasure11 != null) printf("Measure11: %s\n", obj.strMeasure11)
        if (obj.strMeasure12 != null) printf("Measure12: %s\n", obj.strMeasure12)
        if (obj.strMeasure13 != null) printf("Measure13: %s\n", obj.strMeasure13)
        if (obj.strMeasure14 != null) printf("Measure14: %s\n", obj.strMeasure14)
        if (obj.strMeasure15 != null) printf("Measure15: %s\n", obj.strMeasure15)
        if (obj.strImageSource != null) printf("Image Source: %s\n", obj.strImageSource)
        if (obj.strImageAttribution != null) printf("Image Attribution: %s\n", obj.strImageAttribution)
        if (obj.strCreativeCommonsConfirmed != null) printf("Creative Commons Confirmed: %s\n", obj.strCreativeCommonsConfirmed)
        if (obj.dateModified != null) printf("Date Modified: %s\n\n", obj.dateModified)
      })
    } else {
      print("Error: Something went wrong")
    }
  }

  def searchById(id: Int): Unit = {
    val data = CocktailDB.searchByID(id)
    if (data != null) {
        if (data.strDrink != null) printf("Drink: %s\n", data.strDrink)
        if (data.idDrink != null) printf("Id: %s\n", data.idDrink)
        if (data.strDrinkAlternate != null) printf("Drink Alternate: %s\n", data.strDrinkAlternate)
        if (data.strTags != null) printf("Tags: %s\n", data.strTags)
        if (data.strCategory != null) printf("Category: %s\n", data.strCategory)
        if (data.strIBA != null) printf("IBA: %s\n", data.strIBA)
        if (data.strAlcoholic != null) printf("Alcoholic: %s\n", data.strAlcoholic)
        if (data.strGlass != null) printf("Glass: %s\n", data.strGlass)
        if (data.strInstructions != null) printf("Instructions: %s\n", data.strInstructions)
        if (data.strInstructionsDE != null) printf("InstructionsDE: %s\n", data.strInstructionsDE)
        if (data.strInstructionsES != null) printf("InstructionsES: %s\n", data.strInstructionsES)
        if (data.strInstructionsFR != null) printf("InstructionsFR: %s\n", data.strInstructionsFR)
        if (data.strInstructionsIT != null) printf("InstructionsIT: %s\n", data.strInstructionsIT)
        if (data.strInstructionsZHHANS != null) printf("InstructionsZH-HANS: %s\n", data.strInstructionsZHHANS)
        if (data.strInstructionsZHHANT != null) printf("InstructionsZH-HANT: %s\n", data.strInstructionsZHHANT)
        if (data.strDrinkThumb != null) printf("Image: %s\n", data.strDrinkThumb)
        if (data.strVideo != null) printf("Video: %s\n", data.strVideo)
        if (data.strIngredient1 != null) printf("Ingredient1: %s\n", data.strIngredient1)
        if (data.strIngredient2 != null) printf("Ingredient2: %s\n", data.strIngredient2)
        if (data.strIngredient3 != null) printf("Ingredient3: %s\n", data.strIngredient3)
        if (data.strIngredient4 != null) printf("Ingredient4: %s\n", data.strIngredient4)
        if (data.strIngredient5 != null) printf("Ingredient5: %s\n", data.strIngredient5)
        if (data.strIngredient6 != null) printf("Ingredient6: %s\n", data.strIngredient6)
        if (data.strIngredient7 != null) printf("Ingredient7: %s\n", data.strIngredient7)
        if (data.strIngredient8 != null) printf("Ingredient8: %s\n", data.strIngredient8)
        if (data.strIngredient9 != null) printf("Ingredient9: %s\n", data.strIngredient9)
        if (data.strIngredient10 != null) printf("Ingredient10: %s\n", data.strIngredient10)
        if (data.strIngredient11 != null) printf("Ingredient11: %s\n", data.strIngredient11)
        if (data.strIngredient12 != null) printf("Ingredient12: %s\n", data.strIngredient12)
        if (data.strIngredient13 != null) printf("Ingredient13: %s\n", data.strIngredient13)
        if (data.strIngredient14 != null) printf("Ingredient14: %s\n", data.strIngredient14)
        if (data.strIngredient15 != null) printf("Ingredient15: %s\n", data.strIngredient15)
        if (data.strMeasure1 != null) printf("Measure1: %s\n", data.strMeasure1)
        if (data.strMeasure2 != null) printf("Measure2: %s\n", data.strMeasure2)
        if (data.strMeasure3 != null) printf("Measure3: %s\n", data.strMeasure3)
        if (data.strMeasure4 != null) printf("Measure4: %s\n", data.strMeasure4)
        if (data.strMeasure5 != null) printf("Measure5: %s\n", data.strMeasure5)
        if (data.strMeasure6 != null) printf("Measure6: %s\n", data.strMeasure6)
        if (data.strMeasure7 != null) printf("Measure7: %s\n", data.strMeasure7)
        if (data.strMeasure8 != null) printf("Measure8: %s\n", data.strMeasure8)
        if (data.strMeasure9 != null) printf("Measure9: %s\n", data.strMeasure9)
        if (data.strMeasure10 != null) printf("Measure10: %s\n", data.strMeasure10)
        if (data.strMeasure11 != null) printf("Measure11: %s\n", data.strMeasure11)
        if (data.strMeasure12 != null) printf("Measure12: %s\n", data.strMeasure12)
        if (data.strMeasure13 != null) printf("Measure13: %s\n", data.strMeasure13)
        if (data.strMeasure14 != null) printf("Measure14: %s\n", data.strMeasure14)
        if (data.strMeasure15 != null) printf("Measure15: %s\n", data.strMeasure15)
        if (data.strImageSource != null) printf("Image Source: %s\n", data.strImageSource)
        if (data.strImageAttribution != null) printf("Image Attribution: %s\n", data.strImageAttribution)
        if (data.strCreativeCommonsConfirmed != null) printf("Creative Commons Confirmed: %s\n", data.strCreativeCommonsConfirmed)
        if (data.dateModified != null) printf("Date Modified: %s\n", data.dateModified)
    } else {
      print("Error: Something went wrong")
    }
  }

  def searchByLetter(char: Char): Unit = {
    val data = CocktailDB.searchByLetter(char)
    if (data != null && !data.isEmpty) {
      data.forEach(obj => {
        if (obj.strDrink != null) printf("Drink: %s\n", obj.strDrink)
        if (obj.idDrink != null) printf("Id: %s\n", obj.idDrink)
        if (obj.strDrinkAlternate != null) printf("Drink Alternate: %s\n", obj.strDrinkAlternate)
        if (obj.strTags != null) printf("Tags: %s\n", obj.strTags)
        if (obj.strCategory != null) printf("Category: %s\n", obj.strCategory)
        if (obj.strIBA != null) printf("IBA: %s\n", obj.strIBA)
        if (obj.strAlcoholic != null) printf("Alcoholic: %s\n", obj.strAlcoholic)
        if (obj.strGlass != null) printf("Glass: %s\n", obj.strGlass)
        if (obj.strInstructions != null) printf("Instructions: %s\n", obj.strInstructions)
        if (obj.strInstructionsDE != null) printf("InstructionsDE: %s\n", obj.strInstructionsDE)
        if (obj.strInstructionsES != null) printf("InstructionsES: %s\n", obj.strInstructionsES)
        if (obj.strInstructionsFR != null) printf("InstructionsFR: %s\n", obj.strInstructionsFR)
        if (obj.strInstructionsIT != null) printf("InstructionsIT: %s\n", obj.strInstructionsIT)
        if (obj.strInstructionsZHHANS != null) printf("InstructionsZH-HANS: %s\n", obj.strInstructionsZHHANS)
        if (obj.strInstructionsZHHANT != null) printf("InstructionsZH-HANT: %s\n", obj.strInstructionsZHHANT)
        if (obj.strDrinkThumb != null) printf("Image: %s\n", obj.strDrinkThumb)
        if (obj.strVideo != null) printf("Video: %s\n", obj.strVideo)
        if (obj.strIngredient1 != null) printf("Ingredient1: %s\n", obj.strIngredient1)
        if (obj.strIngredient2 != null) printf("Ingredient2: %s\n", obj.strIngredient2)
        if (obj.strIngredient3 != null) printf("Ingredient3: %s\n", obj.strIngredient3)
        if (obj.strIngredient4 != null) printf("Ingredient4: %s\n", obj.strIngredient4)
        if (obj.strIngredient5 != null) printf("Ingredient5: %s\n", obj.strIngredient5)
        if (obj.strIngredient6 != null) printf("Ingredient6: %s\n", obj.strIngredient6)
        if (obj.strIngredient7 != null) printf("Ingredient7: %s\n", obj.strIngredient7)
        if (obj.strIngredient8 != null) printf("Ingredient8: %s\n", obj.strIngredient8)
        if (obj.strIngredient9 != null) printf("Ingredient9: %s\n", obj.strIngredient9)
        if (obj.strIngredient10 != null) printf("Ingredient10: %s\n", obj.strIngredient10)
        if (obj.strIngredient11 != null) printf("Ingredient11: %s\n", obj.strIngredient11)
        if (obj.strIngredient12 != null) printf("Ingredient12: %s\n", obj.strIngredient12)
        if (obj.strIngredient13 != null) printf("Ingredient13: %s\n", obj.strIngredient13)
        if (obj.strIngredient14 != null) printf("Ingredient14: %s\n", obj.strIngredient14)
        if (obj.strIngredient15 != null) printf("Ingredient15: %s\n", obj.strIngredient15)
        if (obj.strMeasure1 != null) printf("Measure1: %s\n", obj.strMeasure1)
        if (obj.strMeasure2 != null) printf("Measure2: %s\n", obj.strMeasure2)
        if (obj.strMeasure3 != null) printf("Measure3: %s\n", obj.strMeasure3)
        if (obj.strMeasure4 != null) printf("Measure4: %s\n", obj.strMeasure4)
        if (obj.strMeasure5 != null) printf("Measure5: %s\n", obj.strMeasure5)
        if (obj.strMeasure6 != null) printf("Measure6: %s\n", obj.strMeasure6)
        if (obj.strMeasure7 != null) printf("Measure7: %s\n", obj.strMeasure7)
        if (obj.strMeasure8 != null) printf("Measure8: %s\n", obj.strMeasure8)
        if (obj.strMeasure9 != null) printf("Measure9: %s\n", obj.strMeasure9)
        if (obj.strMeasure10 != null) printf("Measure10: %s\n", obj.strMeasure10)
        if (obj.strMeasure11 != null) printf("Measure11: %s\n", obj.strMeasure11)
        if (obj.strMeasure12 != null) printf("Measure12: %s\n", obj.strMeasure12)
        if (obj.strMeasure13 != null) printf("Measure13: %s\n", obj.strMeasure13)
        if (obj.strMeasure14 != null) printf("Measure14: %s\n", obj.strMeasure14)
        if (obj.strMeasure15 != null) printf("Measure15: %s\n", obj.strMeasure15)
        if (obj.strImageSource != null) printf("Image Source: %s\n", obj.strImageSource)
        if (obj.strImageAttribution != null) printf("Image Attribution: %s\n", obj.strImageAttribution)
        if (obj.strCreativeCommonsConfirmed != null) printf("Creative Commons Confirmed: %s\n", obj.strCreativeCommonsConfirmed)
        if (obj.dateModified != null) printf("Date Modified: %s\n\n", obj.dateModified)
      })
    } else {
      print("Error: Something went wrong")
    }
  }

  def searchIngredient(str: String): Unit = {
    val data = CocktailDB.searchIngredient(str)
    if (data != null) {
      if (data.strIngredient != null) printf("Ingredient: %s\n", data.strIngredient)
      if (data.idIngredient != null) printf("Id: %s\n", data.idIngredient)
      if (data.strDescription != null) printf("Description: %s\n", data.strDescription)
      if (data.strType != null) printf("Type: %s\n", data.strType)
      if (data.strAlcohol != null) printf("Alcohol: %s\n", data.strAlcohol)
      if (data.strABV != null) printf("ABV: %s\n", data.strABV)
    } else {
      print("Error: Something went wrong")
    }
  }

  def searchIngredientById(id: Int): Unit = {
    val data = CocktailDB.searchIngredientByID(id)
    if (data != null) {
      if (data.strIngredient != null) printf("Ingredient: %s\n", data.strIngredient)
      if (data.idIngredient != null) printf("Id: %s\n", data.idIngredient)
      if (data.strDescription != null) printf("Description: %s\n", data.strDescription)
      if (data.strType != null) printf("Type: %s\n", data.strType)
      if (data.strAlcohol != null) printf("Alcohol: %s\n", data.strAlcohol)
      if (data.strABV != null) printf("ABV: %s\n", data.strABV)
    } else {
      print("Error: Something went wrong")
    }
  }

  def random(): Unit = {
    val data = CocktailDB.random()
    if (data != null) {
      if (data.strDrink != null) printf("Drink: %s\n", data.strDrink)
      if (data.idDrink != null) printf("Id: %s\n", data.idDrink)
      if (data.strDrinkAlternate != null) printf("Drink Alternate: %s\n", data.strDrinkAlternate)
      if (data.strTags != null) printf("Tags: %s\n", data.strTags)
      if (data.strCategory != null) printf("Category: %s\n", data.strCategory)
      if (data.strIBA != null) printf("IBA: %s\n", data.strIBA)
      if (data.strAlcoholic != null) printf("Alcoholic: %s\n", data.strAlcoholic)
      if (data.strGlass != null) printf("Glass: %s\n", data.strGlass)
      if (data.strInstructions != null) printf("Instructions: %s\n", data.strInstructions)
      if (data.strInstructionsDE != null) printf("InstructionsDE: %s\n", data.strInstructionsDE)
      if (data.strInstructionsES != null) printf("InstructionsES: %s\n", data.strInstructionsES)
      if (data.strInstructionsFR != null) printf("InstructionsFR: %s\n", data.strInstructionsFR)
      if (data.strInstructionsIT != null) printf("InstructionsIT: %s\n", data.strInstructionsIT)
      if (data.strInstructionsZHHANS != null) printf("InstructionsZH-HANS: %s\n", data.strInstructionsZHHANS)
      if (data.strInstructionsZHHANT != null) printf("InstructionsZH-HANT: %s\n", data.strInstructionsZHHANT)
      if (data.strDrinkThumb != null) printf("Image: %s\n", data.strDrinkThumb)
      if (data.strVideo != null) printf("Video: %s\n", data.strVideo)
      if (data.strIngredient1 != null) printf("Ingredient1: %s\n", data.strIngredient1)
      if (data.strIngredient2 != null) printf("Ingredient2: %s\n", data.strIngredient2)
      if (data.strIngredient3 != null) printf("Ingredient3: %s\n", data.strIngredient3)
      if (data.strIngredient4 != null) printf("Ingredient4: %s\n", data.strIngredient4)
      if (data.strIngredient5 != null) printf("Ingredient5: %s\n", data.strIngredient5)
      if (data.strIngredient6 != null) printf("Ingredient6: %s\n", data.strIngredient6)
      if (data.strIngredient7 != null) printf("Ingredient7: %s\n", data.strIngredient7)
      if (data.strIngredient8 != null) printf("Ingredient8: %s\n", data.strIngredient8)
      if (data.strIngredient9 != null) printf("Ingredient9: %s\n", data.strIngredient9)
      if (data.strIngredient10 != null) printf("Ingredient10: %s\n", data.strIngredient10)
      if (data.strIngredient11 != null) printf("Ingredient11: %s\n", data.strIngredient11)
      if (data.strIngredient12 != null) printf("Ingredient12: %s\n", data.strIngredient12)
      if (data.strIngredient13 != null) printf("Ingredient13: %s\n", data.strIngredient13)
      if (data.strIngredient14 != null) printf("Ingredient14: %s\n", data.strIngredient14)
      if (data.strIngredient15 != null) printf("Ingredient15: %s\n", data.strIngredient15)
      if (data.strMeasure1 != null) printf("Measure1: %s\n", data.strMeasure1)
      if (data.strMeasure2 != null) printf("Measure2: %s\n", data.strMeasure2)
      if (data.strMeasure3 != null) printf("Measure3: %s\n", data.strMeasure3)
      if (data.strMeasure4 != null) printf("Measure4: %s\n", data.strMeasure4)
      if (data.strMeasure5 != null) printf("Measure5: %s\n", data.strMeasure5)
      if (data.strMeasure6 != null) printf("Measure6: %s\n", data.strMeasure6)
      if (data.strMeasure7 != null) printf("Measure7: %s\n", data.strMeasure7)
      if (data.strMeasure8 != null) printf("Measure8: %s\n", data.strMeasure8)
      if (data.strMeasure9 != null) printf("Measure9: %s\n", data.strMeasure9)
      if (data.strMeasure10 != null) printf("Measure10: %s\n", data.strMeasure10)
      if (data.strMeasure11 != null) printf("Measure11: %s\n", data.strMeasure11)
      if (data.strMeasure12 != null) printf("Measure12: %s\n", data.strMeasure12)
      if (data.strMeasure13 != null) printf("Measure13: %s\n", data.strMeasure13)
      if (data.strMeasure14 != null) printf("Measure14: %s\n", data.strMeasure14)
      if (data.strMeasure15 != null) printf("Measure15: %s\n", data.strMeasure15)
      if (data.strImageSource != null) printf("Image Source: %s\n", data.strImageSource)
      if (data.strImageAttribution != null) printf("Image Attribution: %s\n", data.strImageAttribution)
      if (data.strCreativeCommonsConfirmed != null) printf("Creative Commons Confirmed: %s\n", data.strCreativeCommonsConfirmed)
      if (data.dateModified != null) printf("Date Modified: %s\n", data.dateModified)
    } else {
      print("Error: Something went wrong")
    }
  }

  def filterByGlass(str: String): Unit = {
    val data = CocktailDB.filterByGlass(str)
    if (data != null && !data.isEmpty) {
      data.forEach(obj => {
        if (obj.strDrink != null) printf("Drink: %s\n", obj.strDrink)
        if (obj.idDrink != null) printf("Id: %s\n", obj.idDrink)
        if (obj.strDrinkThumb != null) printf("Image: %s\n\n", obj.strDrinkThumb)
      })
    } else {
      print("Error: Something went wrong")
    }
  }

  def filterByIngredient(str: String): Unit = {
    val data = CocktailDB.filterByIngredient(str)
    if (data != null && !data.isEmpty) {
      data.forEach(obj => {
        if (obj.strDrink != null) printf("Drink: %s\n", obj.strDrink)
        if (obj.idDrink != null) printf("Id: %s\n", obj.idDrink)
        if (obj.strDrinkThumb != null) printf("Image: %s\n\n", obj.strDrinkThumb)
      })
    } else {
      print("Error: Something went wrong")
    }
  }

  def filterByCategory(str: String): Unit = {
    val data = CocktailDB.filterByCategory(str)
    if (data != null && !data.isEmpty) {
      data.forEach(obj => {
        if (obj.strDrink != null) printf("Drink: %s\n", obj.strDrink)
        if (obj.idDrink != null) printf("Id: %s\n", obj.idDrink)
        if (obj.strDrinkThumb != null) printf("Image: %s\n\n", obj.strDrinkThumb)
      })
    } else {
      print("Error: Something went wrong")
    }
  }

  def filterByAlcoholic(str: String): Unit = {
    val data = CocktailDB.filterByAlcoholic(str)
    if (data != null && !data.isEmpty) {
      data.forEach(obj => {
        if (obj.strDrink != null) printf("Drink: %s\n", obj.strDrink)
        if (obj.idDrink != null) printf("Id: %s\n", obj.idDrink)
        if (obj.strDrinkThumb != null) printf("Image: %s\n\n", obj.strDrinkThumb)
      })
    } else {
      print("Error: Something went wrong")
    }
  }

  def ingredientsFilter(): Unit = {
    val data = CocktailDB.ingredientsFilter()
    if (data != null && !data.isEmpty) {
      data.forEach(obj => {
        print(obj + "\n")
      })
    } else {
      print("Error: Something went wrong")
    }
  }

  def categoriesFilter(): Unit = {
    val data = CocktailDB.categoriesFilter()
    if (data != null && !data.isEmpty) {
      data.forEach(obj => {
        print(obj + "\n")
      })
    } else {
      print("Error: Something went wrong")
    }
  }

  def glassesFilter(): Unit = {
    val data = CocktailDB.glassesFilter()
    if (data != null && !data.isEmpty) {
      data.forEach(obj => {
        print(obj + "\n")
      })
    } else {
      print("Error: Something went wrong")
    }
  }
}