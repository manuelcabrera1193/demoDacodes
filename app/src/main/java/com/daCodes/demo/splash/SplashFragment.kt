package com.daCodes.demo.splash

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.FragmentActivity
import androidx.lifecycle.Observer
import com.daCodes.demo.main.MainActivity
import com.daCodes.demo.databinding.FragmentSplashBinding
import com.daCodes.demo.util.getViewModel

class SplashFragment : FragmentActivity() {

    private val viewModel: SplashViewModel by lazy {
        getViewModel {
            SplashViewModel()
        }
    }

    companion object {
        const val lottie = "opener-loading.json"
    }

    private lateinit var binding: FragmentSplashBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = FragmentSplashBinding.inflate(layoutInflater)
        setContentView(binding.root)
        viewModel.viewState.observe(this, Observer(::splash))
    }

    private fun splash(splashStates: SplashStates) {
        when (splashStates) {
            SplashStates.Loading -> binding.lottieSplash.setAnimation(lottie)
            SplashStates.Success -> {
                if (binding.lottieSplash.repeatCount == 1) {
                    startActivity(Intent(this, MainActivity::class.java))
                    finish()
                }
            }
        }
    }
}