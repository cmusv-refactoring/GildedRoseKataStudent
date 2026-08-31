# The Gilded Rose Kata

[Terry Hughes](http://iamnotmyself.com/2011/02/14/refactor-this-the-gilded-rose-kata/) created this Kata originally. The idea of a Kata is to provide simple problem-solving exercises that allow you to practice your skills. In this case, you will rely on this Kata to exercise some basic concepts of Refactoring.

Here is a piece of legacy code that works, but it has poor readability. Below you can find a description of what the code does.

## Gilded Rose Requirements Specification

Hi and welcome to team Gilded Rose. As you know, we are a small inn with a prime location in a prominent city ran by a friendly innkeeper named Allison. We also buy and sell only the finest goods. Unfortunately, our goods are constantly degrading in quality as they approach their sell by date. We have a system in place that updates our inventory for us. It was developed by a no-nonsense type named Leeroy, who has moved on to new adventures. Your task is to refactor the code, so we can add a new feature to our system that will allow us to sell a new category of items.

First an introduction to our system:

- All items have a SellIn value which denotes the number of days we have to sell the item
- All items have a Quality value which denotes how valuable the item is
- At the end of each day our system lowers both values for every item

Pretty simple, right? Well this is where it gets interesting:

- Once the sell by date has passed, Quality degrades twice as fast
- The Quality of an item is never negative
- "Aged Brie" actually increases in Quality the older it gets
- The Quality of an item is never more than 50
- "Sulfuras", being a legendary item, never has to be sold or decreases in Quality
- "Backstage passes", like aged brie, increases in Quality as it's SellIn value approaches; Quality increases by 2 when there are 10 days or less and by 3 when there are 5 days or less but Quality drops to 0 after the concert.

## Task
Before adding the modifications that the customer wishes you to implement, you need to refactor the GildedRose class to improve its readability and understandability.
Feel free to make any changes to the `GildedRose.updateQuality` method and add any new code as long as everything still works correctly. However, do not alter the `Item` class or `Items` property.

## Update the README
Write a short section below documenting your refactoring. It should:

- A. Identify at least two refactoring opportunities in the original system and classify them as code smells, design problems, or metric-related structural issues.
- B. Describe the main refactoring operations you applied and which problem each operation addresses.
- C. Explain how the resulting design improves the structural quality of the system.
- D. Describe one refactoring decision where multiple solutions were possible and justify the solution you selected.


## Suggested attribution
This work is adapted from [@TerryHughes](https://twitter.com/TerryHughes), [@NotMyself](https://twitter.com/NotMyself) and [@emilybache](https://twitter.com/emilybache).

Their repository can be found [here](https://github.com/NotMyself/GildedRose)
