package com.example.cvbuilderapplicationassignment6.data

data class Education(
    val collegeName: String,
    val program: String,
    val logo: String
) {

    companion object {
        fun getEducationList() : MutableList<Education> {
            return mutableListOf(
                Education(
                    "Maharishi Internation University",
                    "Master's in Computer Science",
                    "https://maharishischool.org/wp-content/uploads/MaharishiSchoolTreeLogo-8cc541-green.jpg"
                ),
                Education(
                    "National College of Engineering",
                    "Bachelor's in Computer Engineering",
                    "https://www.collegenp.com/uploads/2019/03/National-College-of-Engineering.jpg"
                )
            )
        }
    }
}
