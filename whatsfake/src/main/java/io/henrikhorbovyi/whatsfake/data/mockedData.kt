package io.henrikhorbovyi.whatsfake.data

object MockedData {
    val users = listOf(
        User(
            "Gisele",
            "https://images.unsplash.com/photo-1507430989479-54824c2ed9d6?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=750&q=80"
        ),
        User(
            "Robertin",
            "https://images.unsplash.com/photo-1570295999919-56ceb5ecca61?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=500&q=80"
        ),
        User(
            "Maria",
            "https://images.unsplash.com/photo-1529626455594-4ff0802cfb7e?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=334&q=80"
        )
    )

    val conversations = listOf(
        Message(
            text = "Claro, posso sim",
            sender = users[0]
        ),
        Message(
            text = "E ai? tudo blz?",
            unseen = true,
            sender = users[2]
        ),
        Message(
            text = "Talvez.",
            unseen = true,
            sender = users[1]
        )
    )

    val status = listOf(
        Status(
            user = users[0],
            picture = "https://imgcy.trivago.com/c_limit,d_dummy.jpeg,f_auto,h_1300,q_auto,w_2000/itemimages/19/79/197931_v3.jpeg",
            date = "00-00-0000"
        ),
        Status(
            user = users[1],
            picture = "https://images.unsplash.com/photo-1588778943428-cec10a6f1666?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=750&q=80",
            date = "00-00-0000"
        )
    )
}