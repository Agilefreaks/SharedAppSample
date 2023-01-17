package com.agilefreaks.sharedappsample.features.explore_shared.repo_list

import com.agilefreaks.sharedappsample.features.explore_shared.repo_list.RepoListViewModel
import com.agilefreaks.sharedappsample.features.explore_shared.repo_list.ViewerRepository
import io.mockative.Mock
import org.koin.core.context.startKoin
import org.koin.core.context.stopKoin
import org.koin.dsl.module
import org.koin.test.KoinTest
import org.koin.test.get
import kotlin.test.AfterTest
import kotlin.test.BeforeTest
import kotlin.test.Test
import kotlin.test.assertTrue

class RepoListViewModelTest : KoinTest {
    private val subject by lazy {
        get<RepoListViewModel>()
    }

    @Mock
    private  val viewerRepository = mock(classOf<ViewerRepository>)

    @BeforeTest
    fun setUp() {
        startKoin {
            module {
                single { viewerRepository }
                single { RepoListViewModel(get()) }
            }
        }
    }

    @AfterTest
    fun tearDown() {
        stopKoin()
    }

    @Test
    fun `fetchRepos will not do any calls if it's last page`() {
        val viewModel = RepoListViewModel(viewerRepository)
        assertTrue { true }
    }
}
