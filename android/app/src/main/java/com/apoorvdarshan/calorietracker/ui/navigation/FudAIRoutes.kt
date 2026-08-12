package com.apoorvdarshan.calorietracker.ui.navigation

object FudAIRoutes {
    const val ONBOARDING = "onboarding"

    // New primary product destinations.
    const val TODAY = "today"
    const val TRACK = "track"
    const val INSIGHTS = "insights"
    const val PROGRESS = "progress"

    // Global overlay / assistant destination.
    const val COACH = "coach"

    // Existing routes retained during the M1 migration.
    const val HOME = "home"
    const val SETTINGS = "settings"
    const val OPTIONAL_NUTRIENT_GOALS = "settings/optional-nutrient-goals"
    const val CALCULATION_METHODS = "settings/calculation-methods"
    const val QUICK_ACTIONS = "settings/quick-actions"
    const val BODY_MEASUREMENTS = "settings/body-measurements"
    const val WORKOUTS = "workouts"

    // Target primary navigation model.
    val primaryTabs = listOf(TODAY, TRACK, INSIGHTS, PROGRESS)

    // Temporary legacy tab set. Keep this until the new shell is wired into NavHost.
    val bottomTabs = listOf(HOME, PROGRESS, COACH, SETTINGS, WORKOUTS)
}
