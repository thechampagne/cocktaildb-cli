# CocktailDB

[![](https://img.shields.io/github/v/tag/thechampagne/cocktaildb-cli?label=version)](https://github.com/thechampagne/cocktaildb-cli/releases/latest) [![](https://img.shields.io/github/license/thechampagne/cocktaildb-cli)](https://github.com/thechampagne/cocktaildb-cli/blob/main/LICENSE)

TheCocktailDB CLI app.

### Download

Latest Release: [GitHub Release](https://github.com/thechampagne/cocktaildb-cli/releases/latest)

### Usage

```
cocktail -S "Cocktail name"
             (Search cocktail by name)
or  cocktail -SL "Cocktails letter"
             (Search cocktails by first letter)
or  cocktail -SID "Cocktail id"
             (Search cocktail details by id)
or  cocktail -SI "Ingredient name"
             (Search ingredient by name)
or  cocktail -SIID "Ingredient id"
             (Search ingredient by id)
or  cocktail -R
             (Random cocktail)
or  cocktail -F [filters]
             (Cocktails by filter)
or  cocktail -L [lists]
             (List of filters)
filters:
       -i "Ingredient name"
       -g "Glass name"
       -c "Category name"
       -a
             (Alcoholic)
       -na
             (Non alcoholic)
       -oa
             (Optional alcohol)
lists:
       -i
             (List of ingredients)
       -g
             (List of glasses)
       -c
             (List of categories)
```

### License

CocktailDB is released under the [Apache License 2.0](https://github.com/thechampagne/cocktaildb-cli/blob/main/LICENSE).

```
 Copyright 2022 XXIV

 Licensed under the Apache License, Version 2.0 (the "License");
 you may not use this file except in compliance with the License.
 You may obtain a copy of the License at

     http://www.apache.org/licenses/LICENSE-2.0

 Unless required by applicable law or agreed to in writing, software
 distributed under the License is distributed on an "AS IS" BASIS,
 WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 See the License for the specific language governing permissions and
 limitations under the License.
```