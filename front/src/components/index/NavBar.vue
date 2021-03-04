<template>
    <div>
        <v-app-bar-nav-icon @click.stop="drawer = !drawer">
        </v-app-bar-nav-icon>

        <v-navigation-drawer v-model="drawer" app>
        <v-list dense>
            <v-list-item @click.stop="left = !left">
            <v-list-item-action>
                <v-icon>mdi-login</v-icon>
            </v-list-item-action>

            <v-list-item-content>
                <v-list-item-title @click="home">로그인</v-list-item-title>
            </v-list-item-content>
            </v-list-item>
        </v-list>

        <v-list dense>
            <v-list-item @click.stop="left = !left">
            <v-list-item-action>
                <v-icon>mdi-account-circle</v-icon>
            </v-list-item-action>

            <v-list-item-content>
                <v-list-item-title @click="suggest">마이페이지</v-list-item-title>
            </v-list-item-content>
            </v-list-item>
        </v-list>

        <v-list dense>
            <v-list-item @click.stop="left = !left">
            <v-list-item-action>
                <v-icon>mdi-forum</v-icon>
            </v-list-item-action>

            <v-list-item-content>
                <v-list-item-title @click="community">커뮤니티</v-list-item-title>
            </v-list-item-content>
            </v-list-item>
        </v-list>

        <v-list>
            <v-list-item-title @click="signup" class="signup">회원가입</v-list-item-title>
        </v-list>
        </v-navigation-drawer>
    </div>
</template>

<script>
import router from "@/router";

export default {
    name: "Navbar",
    data: () => ({
        drawer: false,
        left: false
    }),
    methods: {
        home () {
            (window.location.pathname !== '/') ?
            router.push('/') : router.go(0)
        },
        community () {
            (window.location.pathname !== '/communities') ?
            this.$router.push('/communities') : router.go(0)
        },
        signup(){
            (window.location.pathname !== '/signup') ?
            this.$router.push('/signup') : router.go(0)
        }
        
    }
}
</script>
<style>
</style>