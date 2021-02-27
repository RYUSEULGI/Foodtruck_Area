<template>
    <div class="body__container">
        <div class="inner">

            <div id="community">
                <h2>
                    <router-link :to="{ name : List }">커뮤니티</router-link>
                </h2>
                
                <section class="section__community wrap">
                    <router-link :to="{ name : 'Write' }" class="write">
                        ✏️
                    </router-link>
                    <written-form :communities="communities"/>
                </section>
            </div>

        </div>
    </div>
</template>

<script>
import { mapState, mapActions } from 'vuex';
import WrittenForm from '@/components/community/WrittenForm'

export default {
    name: 'List',
    components: {
        WrittenForm
    },
    computed: {
        ...mapState(['communities'])
    },
    mounted() {
        this.fetchCommunityList()
    },
    methods: {
        ...mapActions(['fetchCommunityList'])
    }
}
</script>

<style src="@/assets/style/common.css"></style>
<style src="@/assets/style/community/list.css"></style>