package com.freakycyoas.supersluts.data.job

import com.freakycyoas.supersluts.data.SingleChoiceSelector
import com.freakycyoas.supersluts.model.ChoicesGroup

object JobChoicesGroup: ChoicesGroup by SingleChoiceSelector(
    listOf(
        JobNeet,
        JobStudent,
        JobTeacher,
        JobReporter,
        JobFullTimeSuperhero,
        JobWaitressWaiter,
        JobLifeguard,
        JobSecretary,
        JobNyotaimoriNantaimori,
        JobStreamer,
        JobMaidButler,
        JobSupermodel,
        JobThief,
        JobSuperScientist,
        JobStripper,
        JobPornStar,
        JobTestSubject,
        JobProstitute,
    )
)