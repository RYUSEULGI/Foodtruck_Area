import Vue from 'vue'
import VueRouter from 'vue-router'
import Index from '@/views/Index.vue'
import Signup from '@/views/navbar/Signup.vue'
import List from '@/views/community/List'
import Write from '@/views/community/Write'
import Modify from '@/views/community/Modify'

Vue.use(VueRouter)

const routes = [
  {
    path: '/',
    name: 'Index',
    component: Index
  },
  {
    path: '/signup',
    name: 'Signup',
    component: Signup
  },
  {
    path: '/communities',
    name: 'List',
    components: {
      default: List
    }
  },
  {
    path: '/communities/write',
    name: 'Write',
    components: {
      default: Write
    }
  },
  {
    path: '/communities/:listNo/modify',
    name: 'Modify',
    components: {
      dafalut: Modify
    },
    props: {
      default: true
    }
  }
]

const router = new VueRouter({
  mode: 'history',
  base: process.env.BASE_URL,
  routes
})

export default router
