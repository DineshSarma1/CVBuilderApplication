package com.example.cvbuilderapplicationassignment6.data

data class Certification(
    val logo: String,
    val name: String
) {
    companion object {
        fun getCertificateList(): MutableList<Certification> {
            return mutableListOf(
                Certification(
                    "https://upload.wikimedia.org/wikipedia/commons/thumb/d/d7/Android_robot.svg/872px-Android_robot.svg.png",
                    "Android Development Training"
                ),
                Certification(
                    "https://git-scm.com/images/logos/downloads/Git-Icon-1788C.png",
                    "Git and GitHub Workshop"
                )
            )
        }
    }
}
