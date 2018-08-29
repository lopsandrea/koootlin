package it.koootlin.devfest.feedtalk

import com.google.android.gms.tasks.Task
import com.google.firebase.firestore.DocumentSnapshot
import com.google.firebase.firestore.FirebaseFirestore

class  TalkRepository {

    fun getTalk(id: String): Task<DocumentSnapshot> {
        return FirebaseFirestore.getInstance().collection("talks").document(id).get()
    }
}