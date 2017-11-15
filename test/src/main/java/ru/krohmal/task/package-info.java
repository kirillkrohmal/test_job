/**
 * Необходимо осуществить сбор максимального количества статей (URL) и их текста (основная часть статьи), двигаясь по
 * уровням вниз. Если после полного прохода уровня (всех статей из всех подкатегорий выше) число собранных статей превышает 400,
 * то процесс по категории прекращается. В случае превышения отметки 400 статей после прохода одной из подкатегорий уровня
 * (напр. Подкатегория I на рисунке), следует собрать статьи из других категорий того же уровня (соответственно статьи из
 * Подкатегории II). Собирать статьи со второго уровня (из Подкатегории I 1) не требуется.
 * Таким образом, на выходе из всех категорий получится более 4000 статей суммарно.
 * Полученный текст статьи необходимо сохранить в txt-файл в кодировке UTF-8.
 * Тексты нужно раскидать по папкам категорий и подкатегорий соответственно. Папки подкатегорий должны находиться внутри папок
 * соответствующих категорий. Если статья находится на нулевом уровне, то текстовый файл попадает в корневую папку с названием
 * категории. Если же файл – из подкатегории, то он попадает в папку с названием подкатегории.
 * Название файла: «Код категории_код подкатегории нулевого уровня_код подкатегории первого уровня_ … _ номер статьи.txt»
 *
 * @author parsentev
 * @since 19.07.2016
 */
package ru.krohmal.task;