package com.freakycyoas.supersluts.view.sections

import androidx.compose.ui.text.AnnotatedString
import com.freakycyoas.supersluts.data.job.JobChoicesGroup
import com.freakycyoas.supersluts.view.MainPageSection

object JobSection: MainPageSection by SimpleSection(
    title = "PART-TIME JOB",
    description = AnnotatedString("Do you want a part-time job? If you’re going to have a hidden identity you will need a part-time job for your civilian identity. Superhero work doesn’t take up that much time anyways and usually when a supervillain strikes people will be in full panic mode so they won’t notice if you’re missing."),
    group = JobChoicesGroup,
)