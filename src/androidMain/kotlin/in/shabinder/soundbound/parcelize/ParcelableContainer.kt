package `in`.shabinder.soundbound.parcelize

@Suppress("FunctionName") // Factory function
actual fun ParcelableContainer(value: Parcelable?): ParcelableContainer =
    AndroidParcelableContainer().apply {
        if (value != null) {
            set(value)
        }
    }
