package io.github.thexxiv
package cocktaildb.cli

object App {
  def run(args: Array[String]): Unit = {
    if (!indexExists(args, 0)) {
      println("Usage: cocktail -S \"Cocktail name\"")
      println("             (Search cocktail by name)")
      println("   or  cocktail -SL \"Cocktails letter\"")
      println("             (Search cocktails by first letter)")
      println("   or  cocktail -SID \"Cocktail id\"")
      println("             (Search cocktail details by id)")
      println("   or  cocktail -SI \"Ingredient name\"")
      println("             (Search ingredient by name)")
      println("   or  cocktail -SIID \"Ingredient id\"")
      println("             (Search ingredient by id)")
      println("   or  cocktail -R")
      println("             (Random cocktail)")
      println("   or  cocktail -F [filters]")
      println("             (Cocktails by filter)")
      println("   or  cocktail -L [lists]")
      println("             (List of filters)")
      println("filters:")
      println("       -i \"Ingredient name\"")
      println("       -g \"Glass name\"")
      println("       -c \"Category name\"")
      println("       -a")
      println("             (Alcoholic)")
      println("       -na")
      println("             (Non alcoholic)")
      println("       -oa")
      println("             (Optional alcohol)")
      println("lists:")
      println("       -i")
      println("             (List of ingredients)")
      println("       -g")
      println("             (List of glasses)")
      println("       -c")
      println("             (List of categories)")
    } else if (indexExists(args, 0)) {
      if (args(0).equals("-S")) {
        if (!indexExists(args, 1)) {
          print("Error: Cocktail name is missing")
        } else if (indexExists(args, 1)) {
          Util.search(args(1))
        }
      } else if (args(0).equals("-SID")) {
        if (!indexExists(args, 1)) {
          print("Error: Cocktail id is missing")
        } else if (indexExists(args, 1)) {
          try {
            val number = Integer.parseInt(args(1))
            Util.searchById(number)
          } catch {
            case ex: NumberFormatException => printf("Error: %s is not a number", args(1))
          }
        }
      } else if (args(0).equals("-SL")) {
        if (!indexExists(args, 1)) {
          print("Error: Cocktail letter is missing")
        } else if (indexExists(args, 1)) {
          Util.searchByLetter(args(1).charAt(0))
        }
      } else if (args(0).equals("-SI")) {
        if (!indexExists(args, 1)) {
          print("Error: Ingredient name is missing")
        } else if (indexExists(args, 1)) {
          Util.searchIngredient(args(1))
        }
      } else if (args(0).equals("-SIID")) {
        if (!indexExists(args, 1)) {
          print("Error: Ingredient id is missing")
        } else if (indexExists(args, 1)) {
          try {
            val number = Integer.parseInt(args(1))
            Util.searchIngredientById(number)
          } catch {
            case ex: NumberFormatException => printf("Error: %s is not a number", args(1))
          }
        }
      } else if (args(0).equals("-R")) {
        Util.random()
      } else if (args(0).equals("-F")) {
        if (!indexExists(args, 1)) {
          print("Error: Filter is missing")
        } else if (indexExists(args, 1)) {
          if (args(1).equals("-i")) {
            if (!indexExists(args, 2)) {
              print("Error: Ingredient name is missing")
            } else if (indexExists(args, 2)) {
              Util.filterByIngredient(args(2))
            }
          } else if (args(1).equals("-g")) {
            if (!indexExists(args, 2)) {
              print("Error: Glass name is missing")
            } else if (indexExists(args, 2)) {
              Util.filterByGlass(args(2))
            }
          } else if (args(1).equals("-c")) {
            if (!indexExists(args, 2)) {
              print("Error: Category name is missing")
            } else if (indexExists(args, 2)) {
              Util.filterByCategory(args(2))
            }
          } else if (args(1).equals("-a")) {
            Util.filterByAlcoholic("Alcoholic")
          } else if (args(1).equals("-na")) {
            Util.filterByAlcoholic("Non alcoholic")
          } else if (args(1).equals("-oa")) {
            Util.filterByAlcoholic("Optional alcohol")
          } else {
            printf("Error: %s is a wrong filter", args(1))
          }
        }
      } else if (args(0).equals("-L")) {
        if (!indexExists(args, 1)) {
          print("Error: List name is missing")
        } else if (indexExists(args, 1)) {
          if (args(1).equals("-i")) {
            Util.ingredientsFilter()
          } else if (args(1).equals("-g")) {
            Util.glassesFilter()
          } else if (args(1).equals("-c")) {
            Util.categoriesFilter()
          } else {
            printf("Error: %s is a wrong list", args(1))
          }
        }
      } else {
        println("Usage: cocktail -S \"Cocktail name\"")
        println("             (Search cocktail by name)")
        println("   or  cocktail -SL \"Cocktails letter\"")
        println("             (Search cocktails by first letter)")
        println("   or  cocktail -SID \"Cocktail id\"")
        println("             (Search cocktail details by id)")
        println("   or  cocktail -SI \"Ingredient name\"")
        println("             (Search ingredient by name)")
        println("   or  cocktail -SIID \"Ingredient id\"")
        println("             (Search ingredient by id)")
        println("   or  cocktail -R")
        println("             (Random cocktail)")
        println("   or  cocktail -F [filters]")
        println("             (Cocktails by filter)")
        println("   or  cocktail -L [lists]")
        println("             (List of filters)")
        println("filters:")
        println("       -i \"Ingredient name\"")
        println("       -g \"Glass name\"")
        println("       -c \"Category name\"")
        println("       -a")
        println("             (Alcoholic)")
        println("       -na")
        println("             (Non alcoholic)")
        println("       -oa")
        println("             (Optional alcohol)")
        println("lists:")
        println("       -i")
        println("             (List of ingredients)")
        println("       -g")
        println("             (List of glasses)")
        println("       -c")
        println("             (List of categories)")
      }
    }
  }

  def indexExists(list: Array[String], index: Int): Boolean = {
    index >= 0 && index < list.length
  }
}