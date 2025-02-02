package me.cookie.util

class Messages {
    val map = HashMap<String, String>()

    // occurrence independent
    val header
        get() = map["header"]!!
    val footer
        get() = map["footer"]!!
    val occurrenceStart
        get() = map["occurrence-start"]!!
    val occurrenceEnd
        get() = map["occurrence-end"]!!
    val occurrenceLeaderboard
        get() = (map["occurrence-leaderboard"]!!.split("\n"))
    val occurrenceLeaderboardPlayerScore
        get() = (map["occurrence-leaderboard-player-score"]!!.split("\n"))

    // occurrence names
    val creeperSlayer
        get() = map["creeper-slayer"]!!
    val damageDealer
        get() = map["damage-dealer"]!!
    val fishingPros
        get() = map["fishing-pros"]!!
    val goldMiner
        get() = map["gold-miner"]!!
    val jumper
        get() = map["jumper"]!!
    val leafCutter
        get() = map["leaf-cutter"]!!
    val lumberjack
        get() = map["lumberjack"]!!
    val masochist
        get() = map["masochist"]!!
    val masterBuilders
        get() = map["master-builders"]!!
    val stoneMiner
        get() = map["stone-miner"]!!
    val dj
        get() = map["dj"]!!

    val hoarder
        get() = map["hoarder"]!!

    val dropper
        get() = map["dropper"]!!

    val smelter
        get() = map["smelter"]!!

    val pyrotechnic
        get() = map["pyrotechnic"]!!

    // occurrence descriptions
    val creeperSlayerDescription
        get() = map["creeper-slayer-description"]!!.split("\n")
    val damageDealerDescription
        get() = map["damage-dealer-description"]!!.split("\n")
    val fishingProsDescription
        get() = map["fishing-pros-description"]!!.split("\n")
    val goldMinerDescription
        get() = map["gold-miner-description"]!!.split("\n")
    val jumperDescription
        get() = map["jumper-description"]!!.split("\n")
    val leafCutterDescription
        get() = map["leaf-cutter-description"]!!.split("\n")
    val lumberjackDescription
        get() = map["lumberjack-description"]!!.split("\n")
    val masochistDescription
        get() = map["masochist-description"]!!.split("\n")
    val masterBuildersDescription
        get() = map["master-builders-description"]!!.split("\n")
    val stoneMinerDescription
        get() = map["stone-miner-description"]!!.split("\n")
    val djDescription
        get() = map["dj-description"]!!.split("\n")
    val hoarderDescription
        get() = map["hoarder-description"]!!.split("\n")
    val dropperDescription
        get() = map["dropper-description"]!!.split("\n")
    val smelterDescription
        get() = map["smelter-description"]!!.split("\n")
    val pyrotechnicDescription
        get() = map["pyrotechnic-description"]!!.split("\n")

}