<template>
    <div>
        <div v-if="!communities || (Array.isArray(communities) && communities.length === 0)" class="empty">
            작성된 글이 없습니다😢
        </div>

        <div v-else v-for="community in communities" :key="community.listNo" class="written-form">
            <div class="title">
                <div class="listNo" hidden>{{ community.listNo }}</div>
                <div class="profile">프로필사진</div>
                <div class="userEmail">{{ community.writer }}</div>
                <div class="date">{{ community.regDate }}</div>
            </div>
            <div class="contents">{{ community.contents }}</div>
            <div class="bottom">
                <comment-form/>
            </div>
        </div>
    </div>
</template>

<script>
import CommentForm from '../community/CommentForm.vue';

export default {
    name : 'WrittemForm',
    props: {
        communities: {
            type: Array
        }
    },
    components: { 
        CommentForm 
    }
};
</script>
