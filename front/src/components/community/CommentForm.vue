<template>
    <div>
        <div class="comments">
            <router-link to="{ name : 'comment' }, params: { listNo: community.listNo.toString()}">
                <font-awesone-icon :icon="['far', 'comments']" />
                <span>0</span>
            </router-link>
        </div>
        <div class="like">
            <like-btn :like="plus"/>
        </div>
        <div class="modify">
            <router-link to="{ name : 'modify' }, params: { listNo: community.listNo.toString()}">
                <i class="far fa-keyboard"></i>
                <span>수정</span>
            </router-link>
        </div>
        <div class="remove">
            <router-link to="{ name : 'remove' }, params: { listNo: community.listNo.toString()}">
                <i class="far fa-trash-alt"></i>
                <span>삭제</span>
            </router-link>
        </div>
    </div>
</template>

<script>
// import Vue from 'vue';
import LikeBtn from '../LikeBtn.vue'

// Vue.component(LikeBtn.name, LikeBtn);

    export default {
        name: 'Comment',
        data(){
            return {
                plus: 0
            }
        },
        components: { 
            LikeBtn 
        }
    }
</script>

<style lang="scss" scoped>

</style>