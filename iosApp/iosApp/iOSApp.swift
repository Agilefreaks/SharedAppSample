import SwiftUI
import Shared
import ExploreShared

@main
struct iOSApp: App {
    init() {
        ExploreKt.doInitKoin(properties: [
            Properties.shared.SERVER_URL:"https://api.github.com/graphql",
            Properties.shared.TOKEN: "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"]
        )
    }
    
    var body: some Scene {
        WindowGroup {
            RepoListView(viewModel: RepoListViewModel.init(ViewModelHelper().viewModel()))
        }
    }
}
