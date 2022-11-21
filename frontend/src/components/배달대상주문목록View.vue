<template>

    <v-data-table
        :headers="headers"
        :items="배달대상주문목록"
        :items-per-page="5"
        class="elevation-1"
    ></v-data-table>

</template>

<script>
    const axios = require('axios').default;

    export default {
        name: '배달대상주문목록View',
        props: {
            value: Object,
            editMode: Boolean,
            isNew: Boolean
        },
        data: () => ({
            headers: [
                { text: "id", value: "id" },
            ],
            배달대상주문목록 : [],
        }),
          async created() {
            var temp = await axios.get(axios.fixUrl('/배달대상주문목록'))

            temp.data._embedded.배달대상주문목록.map(obj => obj.id=obj._links.self.href.split("/")[obj._links.self.href.split("/").length - 1])

            this.배달대상주문목록 = temp.data._embedded.배달대상주문목록;
        },
        methods: {
        }
    }
</script>

