<template>
    <button @click="likePlus">
        <i class="far fa-heart"></i>
        {{ plus }}
    </button>
</template>

<script>
// import Vue from 'vue';
// import cookies from 'vue-cookies'

// Vue.use(cookies);
    export default {
        name: 'LikeBtn',
        props: ['like'],
        data(){
            return {
                plus: this.like
            }
        },
        methods: {
            likePlus(){
                this.plus++;
                // 쿠키 set하기
                // set('keyname', 'keyvalue, 'expiring time')
                // this.$cookies.set('plus', this.plus, '24h');
            }
        }
        // created(){
        //     // 쿠키에서 get하기
        //     this.plus = this.$cookies.get('plus');
        // }
    }
</script>