package com.example.cvbuilderapplicationassignment6.ui.contact

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.View
import android.view.View.OnClickListener
import android.widget.LinearLayout
import androidx.fragment.app.Fragment
import com.example.cvbuilderapplicationassignment6.R


class ContactFragment : Fragment(R.layout.fragment_contact), OnClickListener {

    private lateinit var phoneLL: LinearLayout
    private lateinit var emailLL: LinearLayout
    private lateinit var linkedInLL: LinearLayout
    private lateinit var githubLL: LinearLayout
    private lateinit var resumeLL: LinearLayout

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        phoneLL = view.findViewById(R.id.mobile_ll)
        emailLL = view.findViewById(R.id.email_ll)
        linkedInLL = view.findViewById(R.id.linkedin_ll)
        githubLL = view.findViewById(R.id.github_ll)
        resumeLL = view.findViewById(R.id.resume_ll)

        phoneLL.setOnClickListener(this)
        emailLL.setOnClickListener(this)
        linkedInLL.setOnClickListener(this)
        githubLL.setOnClickListener(this)
        resumeLL.setOnClickListener(this)

    }

    private fun onMobileClicked() {
        val intent = Intent(Intent.ACTION_CALL, Uri.parse("tel:" + "+16418192512"))
        context?.startActivity(intent)
    }

    private fun onEmailClicked() {

    }

    private fun onLinkedInClicked() {

    }

    private fun onGithubClicked() {

    }

    private fun onResumeClicked() {

    }

    override fun onClick(view: View?) {
        when(view?.id) {
            R.id.mobile_ll -> onMobileClicked()
            R.id.email_ll -> onEmailClicked()
            R.id.linkedin_ll -> onLinkedInClicked()
            R.id.github_ll -> onGithubClicked()
            R.id.resume_ll -> onResumeClicked()
        }
    }

    companion object {
        @JvmStatic
        fun newInstance() = ContactFragment()
    }


}